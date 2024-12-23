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

public class ArticleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleProjectionRoot() {
    super(null, null, java.util.Optional.of("Article"));
  }

  public ArticleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> author(
      ) {
    ArticleAuthorProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new ArticleAuthorProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public BlogProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> blog(
      ) {
    BlogProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new BlogProjection<>(this, this);    
    getFields().put("blog", projection);
    return projection;
  }

  public CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> comments(
      ) {
    CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CommentConnectionProjection<>(this, this);    
    getFields().put("comments", projection);
    return projection;
  }

  public CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> comments(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CommentConnectionProjection<>(this, this);    
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

  public CountProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> commentsCount(
      ) {
    CountProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("commentsCount", projection);
    return projection;
  }

  public CountProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> commentsCount(
      String query) {
    CountProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("commentsCount", projection);
    getInputArguments().computeIfAbsent("commentsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("commentsCount").add(queryArg);
    return projection;
  }

  public EventConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public ImageProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public PrivateMetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public TranslationProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ArticleProjectionRoot<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
