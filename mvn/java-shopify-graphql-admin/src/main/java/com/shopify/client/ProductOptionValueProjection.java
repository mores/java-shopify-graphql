package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class ProductOptionValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOptionValue"));
  }

  public ProductOptionValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductOptionValueSwatchProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> swatch(
      ) {
     ProductOptionValueSwatchProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionValueSwatchProjection<>(this, getRoot());
     getFields().put("swatch", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ProductOptionValueProjection<PARENT, ROOT> hasVariants() {
    getFields().put("hasVariants", null);
    return this;
  }

  public ProductOptionValueProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductOptionValueProjection<PARENT, ROOT> linkedMetafieldValue() {
    getFields().put("linkedMetafieldValue", null);
    return this;
  }

  public ProductOptionValueProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
