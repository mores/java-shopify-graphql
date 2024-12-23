package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class OnlineStoreThemeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OnlineStoreThemeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreTheme"));
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> files(
      ) {
     OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileConnectionProjection<>(this, getRoot());
     getFields().put("files", projection);
     return projection;
  }

  public OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> files(
      List<String> filenames, Integer first, String after) {
    OnlineStoreThemeFileConnectionProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileConnectionProjection<>(this, getRoot());    
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

  public ThemeRoleProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> role() {
     ThemeRoleProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> projection = new ThemeRoleProjection<>(this, getRoot());
     getFields().put("role", projection);
     return projection;
  }

  public TranslationProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> translations(
      ) {
     TranslationProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<OnlineStoreThemeFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> prefix() {
    getFields().put("prefix", null);
    return this;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> processing() {
    getFields().put("processing", null);
    return this;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> processingFailed() {
    getFields().put("processingFailed", null);
    return this;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> themeStoreId() {
    getFields().put("themeStoreId", null);
    return this;
  }

  public OnlineStoreThemeFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OnlineStoreTheme {");
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
