package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class RegionsConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RegionsConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RegionsCondition"));
  }

  public RegionsConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketConditionApplicationTypeProjection<RegionsConditionProjection<PARENT, ROOT>, ROOT> applicationLevel(
      ) {
     MarketConditionApplicationTypeProjection<RegionsConditionProjection<PARENT, ROOT>, ROOT> projection = new MarketConditionApplicationTypeProjection<>(this, getRoot());
     getFields().put("applicationLevel", projection);
     return projection;
  }

  public MarketRegionConnectionProjection<RegionsConditionProjection<PARENT, ROOT>, ROOT> regions(
      ) {
     MarketRegionConnectionProjection<RegionsConditionProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionConnectionProjection<>(this, getRoot());
     getFields().put("regions", projection);
     return projection;
  }

  public MarketRegionConnectionProjection<RegionsConditionProjection<PARENT, ROOT>, ROOT> regions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketRegionConnectionProjection<RegionsConditionProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionConnectionProjection<>(this, getRoot());    
    getFields().put("regions", projection);
    getInputArguments().computeIfAbsent("regions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("regions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("regions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("regions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("regions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("regions").add(reverseArg);
    return projection;
  }
}
