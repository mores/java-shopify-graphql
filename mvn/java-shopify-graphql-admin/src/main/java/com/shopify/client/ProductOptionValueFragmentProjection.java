package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ProductOptionValueFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductOptionValueFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOptionValue"));
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductOptionValueSwatchProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> swatch(
      ) {
     ProductOptionValueSwatchProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionValueSwatchProjection<>(this, getRoot());
     getFields().put("swatch", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> translations(
      ) {
     TranslationProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ProductOptionValueFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> hasVariants() {
    getFields().put("hasVariants", null);
    return this;
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> linkedMetafieldValue() {
    getFields().put("linkedMetafieldValue", null);
    return this;
  }

  public ProductOptionValueFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductOptionValue {");
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
