package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class OnlineStoreThemeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreTheme"));
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> files(
      ) {
     OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileConnectionProjection<>(this, getRoot());
     getFields().put("files", projection);
     return projection;
  }

  public OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> files(
      List<String> filenames, Integer first, String after) {
    OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileConnectionProjection<>(this, getRoot());    
    getFields().put("files", projection);
    getInputArguments().computeIfAbsent("files", k -> new ArrayList<>());                      
    InputArgument filenamesArg = new InputArgument("filenames", filenames);
    getInputArguments().get("files").add(filenamesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("files").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("files").add(afterArg);
    return projection;
  }

  public ThemeRoleProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> role() {
     ThemeRoleProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> projection = new ThemeRoleProjection<>(this, getRoot());
     getFields().put("role", projection);
     return projection;
  }

  public TranslationProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<OnlineStoreThemeProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> prefix() {
    getFields().put("prefix", null);
    return this;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> processing() {
    getFields().put("processing", null);
    return this;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> processingFailed() {
    getFields().put("processingFailed", null);
    return this;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> themeStoreId() {
    getFields().put("themeStoreId", null);
    return this;
  }

  public OnlineStoreThemeProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
