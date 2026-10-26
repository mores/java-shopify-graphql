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
 * Updates the server pixel to connect to an EventBridge endpoint.
 * Running this mutation deletes any previous subscriptions for the server pixel.
 */
public class EventBridgeServerPixelUpdateGraphQLQuery extends GraphQLQuery {
  public EventBridgeServerPixelUpdateGraphQLQuery(String arn, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (arn != null || fieldsSet.contains("arn")) {
        getInput().put("arn", arn);
    }
  }

  public EventBridgeServerPixelUpdateGraphQLQuery(String arn, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (arn != null || fieldsSet.contains("arn")) {
        getInput().put("arn", arn);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public EventBridgeServerPixelUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "eventBridgeServerPixelUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String arn;

    private String queryName;

    public EventBridgeServerPixelUpdateGraphQLQuery build() {
      return new EventBridgeServerPixelUpdateGraphQLQuery(arn, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ARN for the EventBridge endpoint to which customer events are to be sent.
     */
    public Builder arn(String arn) {
      this.arn = arn;
      this.fieldsSet.add("arn");
      return this;
    }

    /**
     * The ARN for the EventBridge endpoint to which customer events are to be sent.
     */
    public Builder arnReference(String variableRef) {
      this.variableReferences.put("arn", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ARN"))).build());
      this.fieldsSet.add("arn");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
