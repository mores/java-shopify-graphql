package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ProductBundleComponentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponent"));
  }

  public ProductBundleComponentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> componentProduct(
      ) {
     ProductProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("componentProduct", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> componentVariants(
      ) {
     ProductVariantConnectionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("componentVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> componentVariants(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantConnectionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> componentVariantsCount(
      ) {
     CountProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("componentVariantsCount", projection);
     return projection;
  }

  public ProductBundleComponentOptionSelectionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> optionSelections(
      ) {
     ProductBundleComponentOptionSelectionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentOptionSelectionProjection<>(this, getRoot());
     getFields().put("optionSelections", projection);
     return projection;
  }

  public ProductBundleComponentQuantityOptionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> quantityOption(
      ) {
     ProductBundleComponentQuantityOptionProjection<ProductBundleComponentProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentQuantityOptionProjection<>(this, getRoot());
     getFields().put("quantityOption", projection);
     return projection;
  }

  public ProductBundleComponentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
