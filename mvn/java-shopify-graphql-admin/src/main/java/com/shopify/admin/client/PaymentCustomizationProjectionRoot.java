package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class PaymentCustomizationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentCustomization"));
  }

  public PaymentCustomizationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FunctionsErrorHistoryProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> errorHistory(
      ) {
    FunctionsErrorHistoryProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new FunctionsErrorHistoryProjection<>(this, this);    
    getFields().put("errorHistory", projection);
    return projection;
  }

  public MetafieldProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public ShopifyFunctionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> shopifyFunction(
      ) {
    ShopifyFunctionProjection<PaymentCustomizationProjectionRoot<PARENT, ROOT>, PaymentCustomizationProjectionRoot<PARENT, ROOT>> projection = new ShopifyFunctionProjection<>(this, this);    
    getFields().put("shopifyFunction", projection);
    return projection;
  }

  public PaymentCustomizationProjectionRoot<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public PaymentCustomizationProjectionRoot<PARENT, ROOT> functionId() {
    getFields().put("functionId", null);
    return this;
  }

  public PaymentCustomizationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentCustomizationProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
