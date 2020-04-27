package com.javbus.data.base.actress;

import com.javbus.data.base.old.ActressOldDao;
import com.javbus.data.base.old.ActressOldEntity;
import com.javbus.data.base.old.QActressOldEntity;
import com.javbus.data.jpa.ActressDao;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/22 0:34
 * @Description:
 */
@Service
@Slf4j
public class ActressService {

    @Autowired
    private ActressOldDao actressOldDao;

    @Autowired
    private ActressDao actressDao;

    @Autowired
    private JPAQueryFactory jpaQueryFactory;


    public long oldDataToNew() {
        QActressEntity actressEntity = QActressEntity.actressEntity;
        QActressOldEntity actressOldEntity = QActressOldEntity.actressOldEntity;

        //获取总数
        long total = actressOldDao.count();

        long limit = 100L;
        long offset = 0L;
        while (offset < total) {
            List<ActressOldEntity> actressOldEntities =
                    jpaQueryFactory
                            .selectFrom(actressOldEntity)
                            .limit(limit)
                            .offset(offset)
                            .orderBy(actressOldEntity.actress_id.asc())
                            .fetch();

            actressOldEntities.stream().forEach(one -> {
                ActressEntity actressEntity1 = new ActressEntity();
//                BeanUtils.copyProperties(one,actressEntity1);
                actressEntity1.setActressId(String.valueOf(one.getActress_id()));
                actressEntity1.setBirthday(one.getActress_birthday());
                actressEntity1.setBirthPlace(one.getActress_address());
                actressEntity1.setBloodType(one.getActress_blood());
                actressEntity1.setBWH(one.getActress_sanwei());
                actressEntity1.setChnName(one.getActress_name_chn());
                actressEntity1.setCup(one.getActress_cup());
                actressEntity1.setEngName(one.getActress_name_eng());
                actressEntity1.setImage(one.getActress_image());
                actressEntity1.setJpnName(one.getActress_name_jpn());
                actressEntity1.setStature(one.getActress_tall());
                actressEntity1 = actressDao.save(actressEntity1);
                log.info(actressEntity1.toString());
                log.info("第" + actressOldEntities.indexOf(one) + "个");
            });

            offset = offset + limit;
        }
        return actressDao.count();
    }
}
