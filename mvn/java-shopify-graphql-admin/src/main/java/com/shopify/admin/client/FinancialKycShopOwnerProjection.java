package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FinancialKycShopOwnerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FinancialKycShopOwnerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FinancialKycShopOwner"));
  }

  public FinancialKycShopOwnerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FinancialKycShopOwnerProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public FinancialKycShopOwnerProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public FinancialKycShopOwnerProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FinancialKycShopOwnerProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public FinancialKycShopOwnerProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }
}
