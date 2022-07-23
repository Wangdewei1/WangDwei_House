package cn.service;

import cn.entity.Deliver;

import java.util.List;

public interface DeliverService {

    int insertSelective(Deliver record);

    public List<Deliver> getDeliver(String firm);

    int updateByPrimaryKeySelective(Deliver record);

    public List<Deliver> getUserDeliver(Integer id);

    public List<Deliver> getDeliver1(String firm);

    public List<Deliver> getDeliver2(String firm);

    public List<Deliver> getDeliver3(String firm);

    public List<Deliver> getDeliver31(String firm);

    public List<Deliver> getDeliver4(String firm);
}