package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Triggers any workflows that begin with the trigger specified in the request
 * body. To learn more, refer to [_Create Shopify Flow
 * triggers_](https://shopify.dev/apps/flow/triggers).
 */
public class FlowTriggerReceiveGraphQLQuery extends GraphQLQuery {
  public FlowTriggerReceiveGraphQLQuery(String handle, String payload, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (payload != null || fieldsSet.contains("payload")) {
        getInput().put("payload", payload);
    }
  }

  public FlowTriggerReceiveGraphQLQuery(String handle, String payload, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (payload != null || fieldsSet.contains("payload")) {
        getInput().put("payload", payload);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FlowTriggerReceiveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "flowTriggerReceive";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String handle;

    private String payload;

    private String queryName;

    public FlowTriggerReceiveGraphQLQuery build() {
      return new FlowTriggerReceiveGraphQLQuery(handle, payload, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The handle of the trigger.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The handle of the trigger.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The payload needed to run the Trigger.
     */
    public Builder payload(String payload) {
      this.payload = payload;
      this.fieldsSet.add("payload");
      return this;
    }

    /**
     * The payload needed to run the Trigger.
     */
    public Builder payloadReference(String variableRef) {
      this.variableReferences.put("payload", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("JSON")).build());
      this.fieldsSet.add("payload");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
