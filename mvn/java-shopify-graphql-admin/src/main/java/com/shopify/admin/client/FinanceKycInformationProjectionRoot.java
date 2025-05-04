package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FinanceKycInformationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FinanceKycInformationProjectionRoot() {
    super(null, null, java.util.Optional.of("FinanceKycInformation"));
  }

  public FinanceKycInformationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsAddressBasicProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> businessAddress(
      ) {
    ShopifyPaymentsAddressBasicProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsAddressBasicProjection<>(this, this);    
    getFields().put("businessAddress", projection);
    return projection;
  }

  public ShopifyPaymentsBusinessTypeProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> businessType(
      ) {
    ShopifyPaymentsBusinessTypeProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsBusinessTypeProjection<>(this, this);    
    getFields().put("businessType", projection);
    return projection;
  }

  public ShopifyPaymentsMerchantCategoryCodeProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> industry(
      ) {
    ShopifyPaymentsMerchantCategoryCodeProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsMerchantCategoryCodeProjection<>(this, this);    
    getFields().put("industry", projection);
    return projection;
  }

  public FinancialKycShopOwnerProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> shopOwner(
      ) {
    FinancialKycShopOwnerProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> projection = new FinancialKycShopOwnerProjection<>(this, this);    
    getFields().put("shopOwner", projection);
    return projection;
  }

  public ShopifyPaymentsTaxIdentificationProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> taxIdentification(
      ) {
    ShopifyPaymentsTaxIdentificationProjection<FinanceKycInformationProjectionRoot<PARENT, ROOT>, FinanceKycInformationProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsTaxIdentificationProjection<>(this, this);    
    getFields().put("taxIdentification", projection);
    return projection;
  }

  public FinanceKycInformationProjectionRoot<PARENT, ROOT> legalName() {
    getFields().put("legalName", null);
    return this;
  }
}
