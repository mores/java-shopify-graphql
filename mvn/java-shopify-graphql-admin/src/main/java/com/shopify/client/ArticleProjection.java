package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ArticleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Article"));
  }

  public ArticleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorProjection<ArticleProjection<PARENT, ROOT>, ROOT> author() {
     ArticleAuthorProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public BlogProjection<ArticleProjection<PARENT, ROOT>, ROOT> blog() {
     BlogProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new BlogProjection<>(this, getRoot());
     getFields().put("blog", projection);
     return projection;
  }

  public CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> comments() {
     CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());
     getFields().put("comments", projection);
     return projection;
  }

  public CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> comments(Integer first,
      String after, Integer last, String before, Boolean reverse, String query) {
    CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());    
    getFields().put("comments", projection);
    getInputArguments().computeIfAbsent("comments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("comments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("comments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("comments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("comments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("comments").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("comments").add(queryArg);
    return projection;
  }

  public CountProjection<ArticleProjection<PARENT, ROOT>, ROOT> commentsCount() {
     CountProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("commentsCount", projection);
     return projection;
  }

  public CountProjection<ArticleProjection<PARENT, ROOT>, ROOT> commentsCount(String query) {
    CountProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("commentsCount", projection);
    getInputArguments().computeIfAbsent("commentsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("commentsCount").add(queryArg);
    return projection;
  }

  public EventConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ImageProjection<ArticleProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public TranslationProjection<ArticleProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ArticleProjection<PARENT, ROOT>, ROOT> translations(String locale,
      String marketId) {
    TranslationProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ArticleProjection<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
