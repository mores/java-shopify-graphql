package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MenuProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Menu"));
  }

  public MenuProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuItemProjection<MenuProjection<PARENT, ROOT>, ROOT> items() {
     MenuItemProjection<MenuProjection<PARENT, ROOT>, ROOT> projection = new MenuItemProjection<>(this, getRoot());
     getFields().put("items", projection);
     return projection;
  }

  public MenuItemProjection<MenuProjection<PARENT, ROOT>, ROOT> items(Integer limit) {
    MenuItemProjection<MenuProjection<PARENT, ROOT>, ROOT> projection = new MenuItemProjection<>(this, getRoot());    
    getFields().put("items", projection);
    getInputArguments().computeIfAbsent("items", k -> new ArrayList<>());                      
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("items").add(limitArg);
    return projection;
  }

  public TranslationProjection<MenuProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<MenuProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<MenuProjection<PARENT, ROOT>, ROOT> translations(String locale,
      String marketId) {
    TranslationProjection<MenuProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public MenuProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MenuProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MenuProjection<PARENT, ROOT> isDefault() {
    getFields().put("isDefault", null);
    return this;
  }

  public MenuProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
