package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ChannelCreateInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel)
 * representing a connection between the shop and an external selling platform
 * account. Use this mutation after a merchant authenticates with an external
 * platform to establish the publishing destination for product syndication and,
 * for order-generating channels, order import.
 *   
 * The platform resolves the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
 * identified by `specificationHandle`, determines its country coverage,
 * intersects with the shop's available region markets, and establishes product
 * feeds for all matching regions. Product feeds immediately begin emitting
 * events to the application's webhook or event subscription.
 *   
 * If the specification sets `expects_online_store_parity` and no matching region
 * markets exist, the mutation returns an error. If the specification doesn't
 * require online store parity and no matching region markets exist, a channel
 * subordinate to shop defaults is created automatically.
 */
public class ChannelCreateGraphQLQuery extends GraphQLQuery {
  public ChannelCreateGraphQLQuery(ChannelCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ChannelCreateGraphQLQuery(ChannelCreateInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ChannelCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "channelCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ChannelCreateInput input;

    private String queryName;

    public ChannelCreateGraphQLQuery build() {
      return new ChannelCreateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for creating the channel.
     */
    public Builder input(ChannelCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for creating the channel.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ChannelCreateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
