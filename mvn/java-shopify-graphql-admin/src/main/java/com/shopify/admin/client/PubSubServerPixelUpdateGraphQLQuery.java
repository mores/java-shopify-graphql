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
 * Updates the server pixel to connect to a Google PubSub endpoint.
 * Running this mutation deletes any previous subscriptions for the server pixel.
 */
public class PubSubServerPixelUpdateGraphQLQuery extends GraphQLQuery {
  public PubSubServerPixelUpdateGraphQLQuery(String pubSubProject, String pubSubTopic,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (pubSubProject != null || fieldsSet.contains("pubSubProject")) {
        getInput().put("pubSubProject", pubSubProject);
    }if (pubSubTopic != null || fieldsSet.contains("pubSubTopic")) {
        getInput().put("pubSubTopic", pubSubTopic);
    }
  }

  public PubSubServerPixelUpdateGraphQLQuery(String pubSubProject, String pubSubTopic,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (pubSubProject != null || fieldsSet.contains("pubSubProject")) {
        getInput().put("pubSubProject", pubSubProject);
    }if (pubSubTopic != null || fieldsSet.contains("pubSubTopic")) {
        getInput().put("pubSubTopic", pubSubTopic);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PubSubServerPixelUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pubSubServerPixelUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String pubSubProject;

    private String pubSubTopic;

    private String queryName;

    public PubSubServerPixelUpdateGraphQLQuery build() {
      return new PubSubServerPixelUpdateGraphQLQuery(pubSubProject, pubSubTopic, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The Google PubSub project ID.
     */
    public Builder pubSubProject(String pubSubProject) {
      this.pubSubProject = pubSubProject;
      this.fieldsSet.add("pubSubProject");
      return this;
    }

    /**
     * The Google PubSub project ID.
     */
    public Builder pubSubProjectReference(String variableRef) {
      this.variableReferences.put("pubSubProject", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("pubSubProject");
      return this;
    }

    /**
     * The Google PubSub topic ID.
     */
    public Builder pubSubTopic(String pubSubTopic) {
      this.pubSubTopic = pubSubTopic;
      this.fieldsSet.add("pubSubTopic");
      return this;
    }

    /**
     * The Google PubSub topic ID.
     */
    public Builder pubSubTopicReference(String variableRef) {
      this.variableReferences.put("pubSubTopic", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("pubSubTopic");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
