package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.DeliveryMethodDefinitionType;
import com.shopify.types.MethodDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryLocationGroupZoneProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLocationGroupZoneProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLocationGroupZone"));
  }

  public DeliveryLocationGroupZoneProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodDefinitionCountsProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> methodDefinitionCounts(
      ) {
     DeliveryMethodDefinitionCountsProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodDefinitionCountsProjection<>(this, getRoot());
     getFields().put("methodDefinitionCounts", projection);
     return projection;
  }

  public DeliveryMethodDefinitionConnectionProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> methodDefinitions(
      ) {
     DeliveryMethodDefinitionConnectionProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("methodDefinitions", projection);
     return projection;
  }

  public DeliveryMethodDefinitionConnectionProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> methodDefinitions(
      Boolean eligible, DeliveryMethodDefinitionType type, Integer first, String after,
      Integer last, String before, Boolean reverse, MethodDefinitionSortKeys sortKey) {
    DeliveryMethodDefinitionConnectionProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("methodDefinitions", projection);
    getInputArguments().computeIfAbsent("methodDefinitions", k -> new ArrayList<>());                      
    InputArgument eligibleArg = new InputArgument("eligible", eligible);
    getInputArguments().get("methodDefinitions").add(eligibleArg);
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("methodDefinitions").add(typeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("methodDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("methodDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("methodDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("methodDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("methodDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("methodDefinitions").add(sortKeyArg);
    return projection;
  }

  public DeliveryZoneProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> zone() {
     DeliveryZoneProjection<DeliveryLocationGroupZoneProjection<PARENT, ROOT>, ROOT> projection = new DeliveryZoneProjection<>(this, getRoot());
     getFields().put("zone", projection);
     return projection;
  }
}
