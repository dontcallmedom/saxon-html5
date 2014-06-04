/**
 A wrapper of HtmlParser set to fix and ignore validation issues 
 to be used with Saxon
 Shamelessly taken from Jirka Kosek indications at
 http://markmail.org/message/xcvmedf2zs4za34o
 **/

package net.nimbustier.html;

import nu.validator.htmlparser.common.XmlViolationPolicy;

public class HtmlParser extends nu.validator.htmlparser.sax.HtmlParser {

/** * Instantiates the parser with a non-fatal XML violation policy. * */ public HtmlParser() { super(XmlViolationPolicy.ALTER_INFOSET);

}

/** * Ignore requests for DTD validation as validator.nu doesn't support it * */ public void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { if (!name.equals("http://xml.org/sax/features/validation")) super.setFeature(name, value); } }