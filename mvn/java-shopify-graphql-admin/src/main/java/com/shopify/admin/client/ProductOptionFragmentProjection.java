package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ProductOptionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductOptionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOption"));
  }

  public ProductOptionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LinkedMetafieldProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> linkedMetafield(
      ) {
     LinkedMetafieldProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LinkedMetafieldProjection<>(this, getRoot());
     getFields().put("linkedMetafield", projection);
     return projection;
  }

  public ProductOptionValueProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> optionValues(
      ) {
     ProductOptionValueProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionValueProjection<>(this, getRoot());
     getFields().put("optionValues", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ProductOptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ProductOptionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductOptionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ProductOptionFragmentProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductOptionFragmentProjection<PARENT, ROOT> values() {
    getFields().put("values", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductOption {");
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
