package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ProductComponentTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductComponentTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductComponentType"));
  }

  public ProductComponentTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> componentVariants(
      ) {
     ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("componentVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> componentVariants(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("componentVariants", projection);
    getInputArguments().computeIfAbsent("componentVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("componentVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("componentVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("componentVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("componentVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("componentVariants").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> componentVariantsCount(
      ) {
     CountProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("componentVariantsCount", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> nonComponentVariants(
      ) {
     ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("nonComponentVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> nonComponentVariants(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("nonComponentVariants", projection);
    getInputArguments().computeIfAbsent("nonComponentVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("nonComponentVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("nonComponentVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("nonComponentVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("nonComponentVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("nonComponentVariants").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> nonComponentVariantsCount(
      ) {
     CountProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("nonComponentVariantsCount", projection);
     return projection;
  }

  public ProductProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductComponentTypeProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }
}
