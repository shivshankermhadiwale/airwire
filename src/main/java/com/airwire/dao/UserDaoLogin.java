package com.airwire.dao;

import java.util.List;

import com.airwire.model.Systems;

public abstract interface UserDaoLogin
{
  public  List<Systems> login(Systems paramSystems);
}
