package com.futurex.Caster.utils.factory;

import com.futurex.Caster.model.users.Secretes;
import com.futurex.Caster.model.users.SettingProperty;
import com.futurex.Caster.model.users.User;
import com.futurex.Caster.model.users.UserProperty;
import com.futurex.Caster.model.users.UserType;

public class UserFactory {
  final static public String UUID = "123456789";
  final static public Long LOG_ID = 190L;
  final static public String FIRST_NAME = "testUserFirstName";
  final static public String LAST_NAME = "testUserLastName";
  final static public Secretes SECRETES = new Secretes("userPassword");
  final static public UserProperty USER_PROPERTY = new UserProperty("name", UserType.ADMIN);
  final static public SettingProperty SETTING_PROPERTY = new SettingProperty(true);
  final static public String CREATE_AT = "12987";
  final static public String ARCHIVED_AT = "";
  final static public String UPDATE_AT = "12987";
  final static public User USER = new User(
  UUID,LOG_ID,FIRST_NAME,LAST_NAME,CREATE_AT,ARCHIVED_AT,UPDATE_AT
  );
}
