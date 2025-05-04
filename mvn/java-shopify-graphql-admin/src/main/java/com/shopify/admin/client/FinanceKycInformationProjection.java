package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FinanceKycInformationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FinanceKycInformationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FinanceKycInformation"));
  }

  public FinanceKycInformationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> businessAddress(
      ) {
     ShopifyPaymentsAddressBasicProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAddressBasicProjection<>(this, getRoot());
     getFields().put("businessAddress", projection);
     return projection;
  }

  public ShopifyPaymentsBusinessTypeProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> businessType(
      ) {
     ShopifyPaymentsBusinessTypeProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBusinessTypeProjection<>(this, getRoot());
     getFields().put("businessType", projection);
     return projection;
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> industry(
      ) {
     ShopifyPaymentsMerchantCategoryCodeProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsMerchantCategoryCodeProjection<>(this, getRoot());
     getFields().put("industry", projection);
     return projection;
  }

  public FinancialKycShopOwnerProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> shopOwner(
      ) {
     FinancialKycShopOwnerProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> projection = new FinancialKycShopOwnerProjection<>(this, getRoot());
     getFields().put("shopOwner", projection);
     return projection;
  }

  public ShopifyPaymentsTaxIdentificationProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> taxIdentification(
      ) {
     ShopifyPaymentsTaxIdentificationProjection<FinanceKycInformationProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsTaxIdentificationProjection<>(this, getRoot());
     getFields().put("taxIdentification", projection);
     return projection;
  }

  public FinanceKycInformationProjection<PARENT, ROOT> legalName() {
    getFields().put("legalName", null);
    return this;
  }
}
