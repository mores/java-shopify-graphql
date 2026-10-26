package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ThemeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeProjectionRoot() {
    super(null, null, java.util.Optional.of("OnlineStoreTheme"));
  }

  public ThemeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileConnectionProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> files(
      ) {
    OnlineStoreThemeFileConnectionProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFileConnectionProjection<>(this, this);    
    getFields().put("files", projection);
    return projection;
  }

  public OnlineStoreThemeFileConnectionProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> files(
      List<String> filenames, Integer first, String after) {
    OnlineStoreThemeFileConnectionProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFileConnectionProjection<>(this, this);    
    getFields().put("files", projection);
    getInputArguments().computeIfAbsent("files", k -> new ArrayList<>());                      
    InputArgument filenamesArg = new InputArgument("filenames", filenames, false, null);
    getInputArguments().get("files").add(filenamesArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("files").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("files").add(afterArg);
    return projection;
  }

  public OnlineStoreThemeFileConnectionProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> filesWithVariableReferences(
      String filenamesReference, String firstReference, String afterReference) {
    OnlineStoreThemeFileConnectionProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeFileConnectionProjection<>(this, this);    
    getFields().put("files", projection);
    getInputArguments().computeIfAbsent("files", k -> new ArrayList<>());              
    InputArgument filenamesArg = new InputArgument("filenames", filenamesReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))));
    getInputArguments().get("files").add(filenamesArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("files").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("files").add(afterArg);
    return projection;
  }

  public ThemeRoleProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> role(
      ) {
    ThemeRoleProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> projection = new ThemeRoleProjection<>(this, this);    
    getFields().put("role", projection);
    return projection;
  }

  public TranslationProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> translationsWithVariableReferences(
      String localeReference, String marketIdReference) {
    TranslationProjection<ThemeProjectionRoot<PARENT, ROOT>, ThemeProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ThemeProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ThemeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ThemeProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ThemeProjectionRoot<PARENT, ROOT> prefix() {
    getFields().put("prefix", null);
    return this;
  }

  public ThemeProjectionRoot<PARENT, ROOT> processing() {
    getFields().put("processing", null);
    return this;
  }

  public ThemeProjectionRoot<PARENT, ROOT> processingFailed() {
    getFields().put("processingFailed", null);
    return this;
  }

  public ThemeProjectionRoot<PARENT, ROOT> themeStoreId() {
    getFields().put("themeStoreId", null);
    return this;
  }

  public ThemeProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
