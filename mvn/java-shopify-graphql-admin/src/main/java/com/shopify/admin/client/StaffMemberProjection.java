package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.StaffMemberDefaultImage;
import java.util.ArrayList;

public class StaffMemberProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StaffMemberProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StaffMember"));
  }

  public StaffMemberProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccountTypeProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> accountType() {
     AccountTypeProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> projection = new AccountTypeProjection<>(this, getRoot());
     getFields().put("accountType", projection);
     return projection;
  }

  public ImageProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> avatar() {
     ImageProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("avatar", projection);
     return projection;
  }

  public ImageProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> avatar(
      StaffMemberDefaultImage fallback) {
    ImageProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());    
    getFields().put("avatar", projection);
    getInputArguments().computeIfAbsent("avatar", k -> new ArrayList<>());                      
    InputArgument fallbackArg = new InputArgument("fallback", fallback);
    getInputArguments().get("avatar").add(fallbackArg);
    return projection;
  }

  public StaffMemberPrivateDataProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> privateData() {
     StaffMemberPrivateDataProjection<StaffMemberProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberPrivateDataProjection<>(this, getRoot());
     getFields().put("privateData", projection);
     return projection;
  }

  public StaffMemberProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> exists() {
    getFields().put("exists", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> initials() {
    getFields().put("initials", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> isShopOwner() {
    getFields().put("isShopOwner", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StaffMemberProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }
}
