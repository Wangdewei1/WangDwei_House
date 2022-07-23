package cn.service.impl;

import cn.dao.DeliverMapper;
import cn.entity.Deliver;
import cn.service.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 53191 on 2018/12/27.
 */
@Service("deliverService")
public class DeliverServiceImpl implements DeliverService {

    @Autowired
    DeliverMapper deliverMapper;

    
    public int insertSelective(Deliver record) {
        return deliverMapper.insertSelective(record);
    }

   
    public List<Deliver> getDeliver(String firm) {
        return deliverMapper.getDeliver(firm);
    }

   
    public int updateByPrimaryKeySelective(Deliver record) {
        return deliverMapper.updateByPrimaryKeySelective(record);
    }

    
    public List<Deliver> getUserDeliver(Integer id) {
        return deliverMapper.getUserDeliver(id);
    }

    public List<Deliver> getDeliver1(String firm) {
        return deliverMapper.getDeliver1(firm);
    }

    public List<Deliver> getDeliver2(String firm) {
        return deliverMapper.getDeliver2(firm);
    }

    public List<Deliver> getDeliver3(String firm) {
        return deliverMapper.getDeliver3(firm);
    }

    public List<Deliver> getDeliver31(String firm) {
        return deliverMapper.getDeliver31(firm);
    }

    public List<Deliver> getDeliver4(String firm) {
        return deliverMapper.getDeliver4(firm);
    }


}
