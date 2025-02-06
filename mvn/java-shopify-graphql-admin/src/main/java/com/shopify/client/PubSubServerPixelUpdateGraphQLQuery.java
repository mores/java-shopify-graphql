package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
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

    private String pubSubProject;

    private String pubSubTopic;

    private String queryName;

    public PubSubServerPixelUpdateGraphQLQuery build() {
      return new PubSubServerPixelUpdateGraphQLQuery(pubSubProject, pubSubTopic, queryName, fieldsSet);
               
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
     * The Google PubSub topic ID.
     */
    public Builder pubSubTopic(String pubSubTopic) {
      this.pubSubTopic = pubSubTopic;
      this.fieldsSet.add("pubSubTopic");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
