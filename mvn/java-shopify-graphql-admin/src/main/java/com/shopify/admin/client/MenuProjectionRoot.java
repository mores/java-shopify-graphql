package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MenuProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuProjectionRoot() {
    super(null, null, java.util.Optional.of("Menu"));
  }

  public MenuProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuItemProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> items(
      ) {
    MenuItemProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> projection = new MenuItemProjection<>(this, this);    
    getFields().put("items", projection);
    return projection;
  }

  public MenuItemProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> items(
      Integer limit) {
    MenuItemProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> projection = new MenuItemProjection<>(this, this);    
    getFields().put("items", projection);
    getInputArguments().computeIfAbsent("items", k -> new ArrayList<>());                      
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("items").add(limitArg);
    return projection;
  }

  public TranslationProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public MenuProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MenuProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MenuProjectionRoot<PARENT, ROOT> isDefault() {
    getFields().put("isDefault", null);
    return this;
  }

  public MenuProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
