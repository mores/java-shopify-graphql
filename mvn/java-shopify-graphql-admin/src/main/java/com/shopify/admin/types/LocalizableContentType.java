package com.shopify.admin.types;

/**
 * Specifies the type of the underlying localizable content. This can be used to
 * conditionally render different UI elements such as input fields.
 */
public enum LocalizableContentType {
  /**
   * A JSON string.
   */
  JSON_STRING,

  /**
   * A JSON.
   */
  JSON,

  /**
   * A link.
   */
  LINK,

  /**
   * A list of links.
   */
  LIST_LINK,

  /**
   * A list of multi-line texts.
   */
  LIST_MULTI_LINE_TEXT_FIELD,

  /**
   * A list of single-line texts.
   */
  LIST_SINGLE_LINE_TEXT_FIELD,

  /**
   * A list of URLs.
   */
  LIST_URL,

  /**
   * A multi-line text.
   */
  MULTI_LINE_TEXT_FIELD,

  /**
   * A rich text.
   */
  RICH_TEXT_FIELD,

  /**
   * A single-line text.
   */
  SINGLE_LINE_TEXT_FIELD,

  /**
   * A string.
   */
  STRING,

  /**
   * A URL.
   */
  URL,

  /**
   * A file reference.
   */
  FILE_REFERENCE,

  /**
   * A list of file references.
   */
  LIST_FILE_REFERENCE,

  /**
   * An HTML.
   */
  HTML,

  /**
   * A URI.
   */
  URI,

  /**
   * An inline rich text.
   */
  INLINE_RICH_TEXT
}
