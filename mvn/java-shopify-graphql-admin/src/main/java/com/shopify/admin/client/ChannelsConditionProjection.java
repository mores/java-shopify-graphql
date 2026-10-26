package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ChannelsConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelsConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelsCondition"));
  }

  public ChannelsConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketConditionApplicationTypeProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> applicationLevel(
      ) {
     MarketConditionApplicationTypeProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> projection = new MarketConditionApplicationTypeProjection<>(this, getRoot());
     getFields().put("applicationLevel", projection);
     return projection;
  }

  public ChannelConnectionProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> channels() {
     ChannelConnectionProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("channels", projection);
     return projection;
  }

  public ChannelConnectionProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> channels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public ChannelConnectionProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> channelsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ChannelConnectionProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public CountProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> channelsCount() {
     CountProjection<ChannelsConditionProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("channelsCount", projection);
     return projection;
  }
}
