package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ShopProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopProjectionRoot() {
    super(null, null, java.util.Optional.of("Shop"));
  }

  public ShopProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BrandProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> brand(
      ) {
    BrandProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new BrandProjection<>(this, this);    
    getFields().put("brand", projection);
    return projection;
  }

  public MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafield(
      String key, String namespace) {
    MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public PaymentSettingsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> paymentSettings(
      ) {
    PaymentSettingsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new PaymentSettingsProjection<>(this, this);    
    getFields().put("paymentSettings", projection);
    return projection;
  }

  public DomainProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> primaryDomain(
      ) {
    DomainProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new DomainProjection<>(this, this);    
    getFields().put("primaryDomain", projection);
    return projection;
  }

  public ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> privacyPolicy(
      ) {
    ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyProjection<>(this, this);    
    getFields().put("privacyPolicy", projection);
    return projection;
  }

  public ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> refundPolicy(
      ) {
    ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyProjection<>(this, this);    
    getFields().put("refundPolicy", projection);
    return projection;
  }

  public ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> shippingPolicy(
      ) {
    ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyProjection<>(this, this);    
    getFields().put("shippingPolicy", projection);
    return projection;
  }

  public CountryCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> shipsToCountries(
      ) {
    CountryCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CountryCodeProjection<>(this, this);    
    getFields().put("shipsToCountries", projection);
    return projection;
  }

  public ShopPayInstallmentsPricingProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> shopPayInstallmentsPricing(
      ) {
    ShopPayInstallmentsPricingProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPayInstallmentsPricingProjection<>(this, this);    
    getFields().put("shopPayInstallmentsPricing", projection);
    return projection;
  }

  public ShopPolicyWithDefaultProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> subscriptionPolicy(
      ) {
    ShopPolicyWithDefaultProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyWithDefaultProjection<>(this, this);    
    getFields().put("subscriptionPolicy", projection);
    return projection;
  }

  public ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> termsOfService(
      ) {
    ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyProjection<>(this, this);    
    getFields().put("termsOfService", projection);
    return projection;
  }

  public ShopProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> moneyFormat() {
    getFields().put("moneyFormat", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
