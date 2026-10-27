package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SellingPlanGroupProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroup"));
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> appliesToProduct(
      String productId) {
    BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("appliesToProduct", projection);
    getInputArguments().computeIfAbsent("appliesToProduct", k -> new ArrayList<>());                      
    InputArgument productIdArg = new InputArgument("productId", productId, false, null);
    getInputArguments().get("appliesToProduct").add(productIdArg);
    return projection;
  }

  public BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> appliesToProductWithVariableReferences(
      String productIdReference) {
    BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("appliesToProduct", projection);
    getInputArguments().computeIfAbsent("appliesToProduct", k -> new ArrayList<>());              
    InputArgument productIdArg = new InputArgument("productId", productIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("appliesToProduct").add(productIdArg);
    return projection;
  }

  public BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> appliesToProductVariant(
      String productVariantId) {
    BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("appliesToProductVariant", projection);
    getInputArguments().computeIfAbsent("appliesToProductVariant", k -> new ArrayList<>());                      
    InputArgument productVariantIdArg = new InputArgument("productVariantId", productVariantId, false, null);
    getInputArguments().get("appliesToProductVariant").add(productVariantIdArg);
    return projection;
  }

  public BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> appliesToProductVariantWithVariableReferences(
      String productVariantIdReference) {
    BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("appliesToProductVariant", projection);
    getInputArguments().computeIfAbsent("appliesToProductVariant", k -> new ArrayList<>());              
    InputArgument productVariantIdArg = new InputArgument("productVariantId", productVariantIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("appliesToProductVariant").add(productVariantIdArg);
    return projection;
  }

  public BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> appliesToProductVariants(
      String productId) {
    BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("appliesToProductVariants", projection);
    getInputArguments().computeIfAbsent("appliesToProductVariants", k -> new ArrayList<>());                      
    InputArgument productIdArg = new InputArgument("productId", productId, false, null);
    getInputArguments().get("appliesToProductVariants").add(productIdArg);
    return projection;
  }

  public BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> appliesToProductVariantsWithVariableReferences(
      String productIdReference) {
    BooleanProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("appliesToProductVariants", projection);
    getInputArguments().computeIfAbsent("appliesToProductVariants", k -> new ArrayList<>());              
    InputArgument productIdArg = new InputArgument("productId", productIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("appliesToProductVariants").add(productIdArg);
    return projection;
  }

  public ProductVariantConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productVariants(
      ) {
    ProductVariantConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("productVariants", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productVariants(
      String productId, Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());                      
    InputArgument productIdArg = new InputArgument("productId", productId, false, null);
    getInputArguments().get("productVariants").add(productIdArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productVariants").add(reverseArg);
    return projection;
  }

  public ProductVariantConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productVariantsWithVariableReferences(
      String productIdReference, String firstReference, String afterReference, String lastReference,
      String beforeReference, String reverseReference) {
    ProductVariantConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());              
    InputArgument productIdArg = new InputArgument("productId", productIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("productVariants").add(productIdArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productVariants").add(reverseArg);
    return projection;
  }

  public CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productVariantsCount(
      ) {
    CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productVariantsCount", projection);
    return projection;
  }

  public CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productVariantsCount(
      String productId) {
    CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productVariantsCount", projection);
    getInputArguments().computeIfAbsent("productVariantsCount", k -> new ArrayList<>());                      
    InputArgument productIdArg = new InputArgument("productId", productId, false, null);
    getInputArguments().get("productVariantsCount").add(productIdArg);
    return projection;
  }

  public CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productVariantsCountWithVariableReferences(
      String productIdReference) {
    CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productVariantsCount", projection);
    getInputArguments().computeIfAbsent("productVariantsCount", k -> new ArrayList<>());              
    InputArgument productIdArg = new InputArgument("productId", productIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("productVariantsCount").add(productIdArg);
    return projection;
  }

  public ProductConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public ProductConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("products").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("products").add(reverseArg);
    return projection;
  }

  public CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> productsCount(
      ) {
    CountProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productsCount", projection);
    return projection;
  }

  public SellingPlanConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> sellingPlans(
      ) {
    SellingPlanConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new SellingPlanConnectionProjection<>(this, this);    
    getFields().put("sellingPlans", projection);
    return projection;
  }

  public SellingPlanConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> sellingPlans(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new SellingPlanConnectionProjection<>(this, this);    
    getFields().put("sellingPlans", projection);
    getInputArguments().computeIfAbsent("sellingPlans", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("sellingPlans").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("sellingPlans").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("sellingPlans").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("sellingPlans").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("sellingPlans").add(reverseArg);
    return projection;
  }

  public SellingPlanConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> sellingPlansWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SellingPlanConnectionProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new SellingPlanConnectionProjection<>(this, this);    
    getFields().put("sellingPlans", projection);
    getInputArguments().computeIfAbsent("sellingPlans", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sellingPlans").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sellingPlans").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sellingPlans").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sellingPlans").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("sellingPlans").add(reverseArg);
    return projection;
  }

  public TranslationProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> translationsWithVariableReferences(
      String localeReference, String marketIdReference) {
    TranslationProjection<SellingPlanGroupProjectionRoot<PARENT, ROOT>, SellingPlanGroupProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> appId() {
    getFields().put("appId", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> appliesToProduct() {
    getFields().put("appliesToProduct", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> appliesToProductVariant() {
    getFields().put("appliesToProductVariant", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> appliesToProductVariants() {
    getFields().put("appliesToProductVariants", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> merchantCode() {
    getFields().put("merchantCode", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> options() {
    getFields().put("options", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public SellingPlanGroupProjectionRoot<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }
}
