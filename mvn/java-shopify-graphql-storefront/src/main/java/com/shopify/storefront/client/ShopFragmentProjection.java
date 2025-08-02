package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ShopFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Shop"));
  }

  public ShopFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BrandProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> brand() {
     BrandProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new BrandProjection<>(this, getRoot());
     getFields().put("brand", projection);
     return projection;
  }

  public MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public PaymentSettingsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> paymentSettings() {
     PaymentSettingsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentSettingsProjection<>(this, getRoot());
     getFields().put("paymentSettings", projection);
     return projection;
  }

  public DomainProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> primaryDomain() {
     DomainProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("primaryDomain", projection);
     return projection;
  }

  public ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> privacyPolicy() {
     ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyProjection<>(this, getRoot());
     getFields().put("privacyPolicy", projection);
     return projection;
  }

  public ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> refundPolicy() {
     ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyProjection<>(this, getRoot());
     getFields().put("refundPolicy", projection);
     return projection;
  }

  public ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> shippingPolicy() {
     ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyProjection<>(this, getRoot());
     getFields().put("shippingPolicy", projection);
     return projection;
  }

  public CountryCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> shipsToCountries() {
     CountryCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("shipsToCountries", projection);
     return projection;
  }

  public ShopPayInstallmentsPricingProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> shopPayInstallmentsPricing(
      ) {
     ShopPayInstallmentsPricingProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsPricingProjection<>(this, getRoot());
     getFields().put("shopPayInstallmentsPricing", projection);
     return projection;
  }

  public ShopPolicyWithDefaultProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> subscriptionPolicy(
      ) {
     ShopPolicyWithDefaultProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyWithDefaultProjection<>(this, getRoot());
     getFields().put("subscriptionPolicy", projection);
     return projection;
  }

  public ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> termsOfService() {
     ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyProjection<>(this, getRoot());
     getFields().put("termsOfService", projection);
     return projection;
  }

  public ShopFragmentProjection<PARENT, ROOT> customerAccountUrl() {
    getFields().put("customerAccountUrl", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> moneyFormat() {
    getFields().put("moneyFormat", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Shop {");
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
