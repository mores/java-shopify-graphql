package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.StaffMemberDefaultImage;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class StaffMemberFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StaffMemberFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StaffMember"));
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccountTypeProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> accountType() {
     AccountTypeProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> projection = new AccountTypeProjection<>(this, getRoot());
     getFields().put("accountType", projection);
     return projection;
  }

  public ImageProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> avatar() {
     ImageProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("avatar", projection);
     return projection;
  }

  public ImageProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> avatar(
      StaffMemberDefaultImage fallback) {
    ImageProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());    
    getFields().put("avatar", projection);
    getInputArguments().computeIfAbsent("avatar", k -> new ArrayList<>());                      
    InputArgument fallbackArg = new InputArgument("fallback", fallback);
    getInputArguments().get("avatar").add(fallbackArg);
    return projection;
  }

  public StaffMemberPrivateDataProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> privateData(
      ) {
     StaffMemberPrivateDataProjection<StaffMemberFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberPrivateDataProjection<>(this, getRoot());
     getFields().put("privateData", projection);
     return projection;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> exists() {
    getFields().put("exists", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> initials() {
    getFields().put("initials", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> isShopOwner() {
    getFields().put("isShopOwner", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StaffMemberFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StaffMember {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
