package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.StaffMemberDefaultImage;
import java.util.ArrayList;

public class CurrentStaffMemberProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrentStaffMemberProjectionRoot() {
    super(null, null, java.util.Optional.of("StaffMember"));
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccountTypeProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> accountType(
      ) {
    AccountTypeProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> projection = new AccountTypeProjection<>(this, this);    
    getFields().put("accountType", projection);
    return projection;
  }

  public ImageProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> avatar(
      ) {
    ImageProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("avatar", projection);
    return projection;
  }

  public ImageProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> avatar(
      StaffMemberDefaultImage fallback) {
    ImageProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("avatar", projection);
    getInputArguments().computeIfAbsent("avatar", k -> new ArrayList<>());                      
    InputArgument fallbackArg = new InputArgument("fallback", fallback);
    getInputArguments().get("avatar").add(fallbackArg);
    return projection;
  }

  public StaffMemberPrivateDataProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> privateData(
      ) {
    StaffMemberPrivateDataProjection<CurrentStaffMemberProjectionRoot<PARENT, ROOT>, CurrentStaffMemberProjectionRoot<PARENT, ROOT>> projection = new StaffMemberPrivateDataProjection<>(this, this);    
    getFields().put("privateData", projection);
    return projection;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> exists() {
    getFields().put("exists", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> initials() {
    getFields().put("initials", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> isShopOwner() {
    getFields().put("isShopOwner", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CurrentStaffMemberProjectionRoot<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }
}
