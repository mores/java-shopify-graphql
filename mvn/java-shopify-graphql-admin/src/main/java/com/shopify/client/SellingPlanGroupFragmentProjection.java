package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SellingPlanGroupFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SellingPlanGroupFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanGroup"));
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> productVariants(
      ) {
     ProductVariantConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("productVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> productVariants(
      String productId, Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());                      
    InputArgument productIdArg = new InputArgument("productId", productId);
    getInputArguments().get("productVariants").add(productIdArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productVariants").add(reverseArg);
    return projection;
  }

  public CountProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> productVariantsCount(
      ) {
     CountProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productVariantsCount", projection);
     return projection;
  }

  public CountProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> productVariantsCount(
      String productId) {
    CountProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("productVariantsCount", projection);
    getInputArguments().computeIfAbsent("productVariantsCount", k -> new ArrayList<>());                      
    InputArgument productIdArg = new InputArgument("productId", productId);
    getInputArguments().get("productVariantsCount").add(productIdArg);
    return projection;
  }

  public ProductConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> products(
      ) {
     ProductConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("products").add(reverseArg);
    return projection;
  }

  public CountProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> productsCount() {
     CountProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productsCount", projection);
     return projection;
  }

  public SellingPlanConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> sellingPlans(
      ) {
     SellingPlanConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlans", projection);
     return projection;
  }

  public SellingPlanConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> sellingPlans(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanConnectionProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlans", projection);
    getInputArguments().computeIfAbsent("sellingPlans", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlans").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlans").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlans").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlans").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlans").add(reverseArg);
    return projection;
  }

  public TranslationProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> translations(
      ) {
     TranslationProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<SellingPlanGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> appId() {
    getFields().put("appId", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> appliesToProduct() {
    getFields().put("appliesToProduct", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection appliesToProduct(String productId) {
    getFields().put("appliesToProduct", null);
    getInputArguments().computeIfAbsent("appliesToProduct", k -> new ArrayList<>());
    InputArgument productIdArg = new InputArgument("productId", productId);
    getInputArguments().get("appliesToProduct").add(productIdArg);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> appliesToProductVariant() {
    getFields().put("appliesToProductVariant", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection appliesToProductVariant(String productVariantId) {
    getFields().put("appliesToProductVariant", null);
    getInputArguments().computeIfAbsent("appliesToProductVariant", k -> new ArrayList<>());
    InputArgument productVariantIdArg = new InputArgument("productVariantId", productVariantId);
    getInputArguments().get("appliesToProductVariant").add(productVariantIdArg);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> appliesToProductVariants() {
    getFields().put("appliesToProductVariants", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection appliesToProductVariants(String productId) {
    getFields().put("appliesToProductVariants", null);
    getInputArguments().computeIfAbsent("appliesToProductVariants", k -> new ArrayList<>());
    InputArgument productIdArg = new InputArgument("productId", productId);
    getInputArguments().get("appliesToProductVariants").add(productIdArg);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> merchantCode() {
    getFields().put("merchantCode", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> options() {
    getFields().put("options", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public SellingPlanGroupFragmentProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SellingPlanGroup {");
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
