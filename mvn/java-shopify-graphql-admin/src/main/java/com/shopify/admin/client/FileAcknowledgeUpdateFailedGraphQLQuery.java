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
 * Acknowledges file update failure by resetting FAILED status to READY and clearing any media errors.
 */
public class FileAcknowledgeUpdateFailedGraphQLQuery extends GraphQLQuery {
  public FileAcknowledgeUpdateFailedGraphQLQuery(List<String> fileIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fileIds != null || fieldsSet.contains("fileIds")) {
        getInput().put("fileIds", fileIds);
    }
  }

  public FileAcknowledgeUpdateFailedGraphQLQuery(List<String> fileIds, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (fileIds != null || fieldsSet.contains("fileIds")) {
        getInput().put("fileIds", fileIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FileAcknowledgeUpdateFailedGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fileAcknowledgeUpdateFailed";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> fileIds;

    private String queryName;

    public FileAcknowledgeUpdateFailedGraphQLQuery build() {
      return new FileAcknowledgeUpdateFailedGraphQLQuery(fileIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the file(s) to acknowledge the failed updates of.
     */
    public Builder fileIds(List<String> fileIds) {
      this.fileIds = fileIds;
      this.fieldsSet.add("fileIds");
      return this;
    }

    /**
     * Specifies the file(s) to acknowledge the failed updates of.
     */
    public Builder fileIdsReference(String variableRef) {
      this.variableReferences.put("fileIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("fileIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
