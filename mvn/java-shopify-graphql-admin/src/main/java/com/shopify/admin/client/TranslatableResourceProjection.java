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
    InputArgument resourceTypeArg = new InputArgument("resourceType", resourceType, false, null);
    getInputArguments().get("nestedTranslatableResources").add(resourceTypeArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("nestedTranslatableResources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("nestedTranslatableResources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("nestedTranslatableResources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("nestedTranslatableResources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("nestedTranslatableResources").add(reverseArg);
    return projection;
  }

  public TranslatableResourceConnectionProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> nestedTranslatableResourcesWithVariableReferences(
      String resourceTypeReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    TranslatableResourceConnectionProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("nestedTranslatableResources", projection);
    getInputArguments().computeIfAbsent("nestedTranslatableResources", k -> new ArrayList<>());              
    InputArgument resourceTypeArg = new InputArgument("resourceType", resourceTypeReference, true, new graphql.language.TypeName("TranslatableResourceType"));
    getInputArguments().get("nestedTranslatableResources").add(resourceTypeArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("nestedTranslatableResources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("nestedTranslatableResources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("nestedTranslatableResources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("nestedTranslatableResources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translatableContent").add(marketIdArg);
    return projection;
  }

  public TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translatableContentWithVariableReferences(
      String marketIdReference) {
    TranslatableContentProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslatableContentProjection<>(this, getRoot());    
    getFields().put("translatableContent", projection);
    getInputArguments().computeIfAbsent("translatableContent", k -> new ArrayList<>());              
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
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
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument outdatedArg = new InputArgument("outdated", outdated, false, null);
    getInputArguments().get("translations").add(outdatedArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> translationsWithVariableReferences(
      String localeReference, String outdatedReference, String marketIdReference) {
    TranslationProjection<TranslatableResourceProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument outdatedArg = new InputArgument("outdated", outdatedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("translations").add(outdatedArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslatableResourceProjection<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }
}
