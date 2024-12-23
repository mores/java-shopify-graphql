package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CodeDiscountNodeByCodeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CodeDiscountNodeByCodeProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeNode"));
  }

  public CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> codeDiscount(
      ) {
    DiscountCodeProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeProjection<>(this, this);    
    getFields().put("codeDiscount", projection);
    return projection;
  }

  public EventConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public MetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public PrivateMetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>, CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public CodeDiscountNodeByCodeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
