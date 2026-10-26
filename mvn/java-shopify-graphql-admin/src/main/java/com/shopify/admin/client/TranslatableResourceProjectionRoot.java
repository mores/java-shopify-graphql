package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.TranslatableResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class TranslatableResourceProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableResourceProjectionRoot() {
    super(null, null, java.util.Optional.of("TranslatableResource"));
  }

  public TranslatableResourceProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslatableResourceConnectionProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> nestedTranslatableResources(
      ) {
    TranslatableResourceConnectionProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslatableResourceConnectionProjection<>(this, this);    
    getFields().put("nestedTranslatableResources", projection);
    return projection;
  }

  public TranslatableResourceConnectionProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> nestedTranslatableResources(
      TranslatableResourceType resourceType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    TranslatableResourceConnectionProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslatableResourceConnectionProjection<>(this, this);    
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

  public TranslatableResourceConnectionProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> nestedTranslatableResourcesWithVariableReferences(
      String resourceTypeReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    TranslatableResourceConnectionProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslatableResourceConnectionProjection<>(this, this);    
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

  public TranslatableContentProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> translatableContent(
      ) {
    TranslatableContentProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslatableContentProjection<>(this, this);    
    getFields().put("translatableContent", projection);
    return projection;
  }

  public TranslatableContentProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> translatableContent(
      String marketId) {
    TranslatableContentProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslatableContentProjection<>(this, this);    
    getFields().put("translatableContent", projection);
    getInputArguments().computeIfAbsent("translatableContent", k -> new ArrayList<>());                      
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translatableContent").add(marketIdArg);
    return projection;
  }

  public TranslatableContentProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> translatableContentWithVariableReferences(
      String marketIdReference) {
    TranslatableContentProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslatableContentProjection<>(this, this);    
    getFields().put("translatableContent", projection);
    getInputArguments().computeIfAbsent("translatableContent", k -> new ArrayList<>());              
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translatableContent").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> translations(
      String locale, Boolean outdated, String marketId) {
    TranslationProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
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

  public TranslationProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> translationsWithVariableReferences(
      String localeReference, String outdatedReference, String marketIdReference) {
    TranslationProjection<TranslatableResourceProjectionRoot<PARENT, ROOT>, TranslatableResourceProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
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

  public TranslatableResourceProjectionRoot<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }
}
