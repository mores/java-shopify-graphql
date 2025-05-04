package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.StaffMemberDefaultImage;
import java.util.ArrayList;

public class StaffMemberProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StaffMemberProjectionRoot() {
    super(null, null, java.util.Optional.of("StaffMember"));
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccountTypeProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> accountType(
      ) {
    AccountTypeProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> projection = new AccountTypeProjection<>(this, this);    
    getFields().put("accountType", projection);
    return projection;
  }

  public ImageProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> avatar(
      ) {
    ImageProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("avatar", projection);
    return projection;
  }

  public ImageProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> avatar(
      StaffMemberDefaultImage fallback) {
    ImageProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("avatar", projection);
    getInputArguments().computeIfAbsent("avatar", k -> new ArrayList<>());                      
    InputArgument fallbackArg = new InputArgument("fallback", fallback);
    getInputArguments().get("avatar").add(fallbackArg);
    return projection;
  }

  public StaffMemberPrivateDataProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> privateData(
      ) {
    StaffMemberPrivateDataProjection<StaffMemberProjectionRoot<PARENT, ROOT>, StaffMemberProjectionRoot<PARENT, ROOT>> projection = new StaffMemberPrivateDataProjection<>(this, this);    
    getFields().put("privateData", projection);
    return projection;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> exists() {
    getFields().put("exists", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> initials() {
    getFields().put("initials", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> isShopOwner() {
    getFields().put("isShopOwner", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StaffMemberProjectionRoot<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }
}
