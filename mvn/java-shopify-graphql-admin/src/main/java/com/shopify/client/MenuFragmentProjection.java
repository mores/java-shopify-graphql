package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MenuFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MenuFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Menu"));
  }

  public MenuFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuItemProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> items() {
     MenuItemProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> projection = new MenuItemProjection<>(this, getRoot());
     getFields().put("items", projection);
     return projection;
  }

  public MenuItemProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> items(Integer limit) {
    MenuItemProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> projection = new MenuItemProjection<>(this, getRoot());    
    getFields().put("items", projection);
    getInputArguments().computeIfAbsent("items", k -> new ArrayList<>());                      
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("items").add(limitArg);
    return projection;
  }

  public TranslationProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<MenuFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public MenuFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MenuFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MenuFragmentProjection<PARENT, ROOT> isDefault() {
    getFields().put("isDefault", null);
    return this;
  }

  public MenuFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Menu {");
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
