package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class ProductOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOption"));
  }

  public ProductOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LinkedMetafieldProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> linkedMetafield() {
     LinkedMetafieldProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> projection = new LinkedMetafieldProjection<>(this, getRoot());
     getFields().put("linkedMetafield", projection);
     return projection;
  }

  public ProductOptionValueProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> optionValues() {
     ProductOptionValueProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionValueProjection<>(this, getRoot());
     getFields().put("optionValues", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ProductOptionProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ProductOptionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductOptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ProductOptionProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductOptionProjection<PARENT, ROOT> values() {
    getFields().put("values", null);
    return this;
  }
}
