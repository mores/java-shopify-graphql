package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.TranslatableResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class TranslatableResourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableResourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TranslatableResource"));
  }

  public TranslatableResourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslatableResourceConnectionProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> nestedTranslatableResources(
      ) {
     TranslatableResourceConnectionProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());
     getFields().put("nestedTranslatableResources", projection);
     return projection;
  }

  public TranslatableResourceConnectionProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> nestedTranslatableResources(
      TranslatableResourceType resourceType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    TranslatableResourceConnectionProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("nestedTranslatableResources", projection);
    getInputArguments().computeIfAbsent("nestedTranslatableResources", k -> new ArrayList<>());                      
    InputArgument resourceTypeArg = new InputArgument("resourceType", resourceType);
    getInputArguments().get("nestedTranslatableResources").add(resourceTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("nestedTranslatableResources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("nestedTranslatableResources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("nestedTranslatableResources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("nestedTranslatableResources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("nestedTranslatableResources").add(reverseArg);
    return projection;
  }

  public TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translatableContent(
      ) {
     TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslatableContentProjection<>(this, getRoot());
     getFields().put("translatableContent", projection);
     return projection;
  }

  public TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translatableContent(
      String marketId) {
    TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslatableContentProjection<>(this, getRoot());    
    getFields().put("translatableContent", projection);
    getInputArguments().computeIfAbsent("translatableContent", k -> new ArrayList<>());                      
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translatableContent").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translations(
      String locale, Boolean outdated, String marketId) {
    TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument outdatedArg = new InputArgument("outdated", outdated);
    getInputArguments().get("translations").add(outdatedArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslatableResourceProjection<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }
}
