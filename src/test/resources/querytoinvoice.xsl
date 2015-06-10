<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:sfo="urn:sobject.partner.soap.sforce.com" xmlns:sf="urn:partner.soap.sforce.com"
	exclude-result-prefixes="xsl xs sfo sf">
	<xsl:output method="xml" omit-xml-declaration="yes" />
	<xsl:template match="sfo:queryresult">
		<create-invoice>
			<xsl:element name="customerid">
				<xsl:value-of select="sf:records/sfo:Account/sfo:AccountNumber" />
			</xsl:element>
			<datecreated>
				<!-- Its not possible to do this in the eclipse xslt runtime. -->
				<xsl:element name="year">
					<xsl:value-of select="year-from-date(current-date())" />
				</xsl:element>
				<xsl:element name="month">
					<xsl:value-of select="month-from-date(current-date())" />
				</xsl:element>
				<xsl:element name="day">
					<xsl:value-of select="day-from-date(current-date())" />
				</xsl:element>
			</datecreated>
			<datedue>
				<!-- Its not possible to do this in the eclipse xslt runtime. -->
				<xsl:element name="year">
					<xsl:value-of
						select="year-from-date(current-date()+xs:dayTimeDuration('P30D')) " />
				</xsl:element>
				<xsl:element name="month">
					<xsl:value-of
						select="month-from-date(current-date()+xs:dayTimeDuration('P30D')) " />
				</xsl:element>
				<xsl:element name="day">
					<xsl:value-of
						select="day-from-date(current-date()+xs:dayTimeDuration('P30D')) " />
				</xsl:element>
			</datedue>
			<invoiceitems>
				<xsl:for-each select="sf:records/sfo:OpportunityLineItems/sf:records">
					<lineitem>

						<xsl:choose>
							<xsl:when test="sfo:Category__c = 'Subscription'">
								<accountlabel>4000</accountlabel>
							</xsl:when>
							<xsl:when test="sfo:Category__c = 'Training'">
								<accountlabel>4002</accountlabel>
							</xsl:when>
							<xsl:when test="sfo:Category__c = 'Consulting'">
								<accountlabel>4001</accountlabel>
							</xsl:when>
							<xsl:when test="sfo:Category__c = '1x Royalty'">
								<accountlabel>4004</accountlabel>
							</xsl:when>
							<xsl:otherwise>
								<accountlabel>4003</accountlabel>
							</xsl:otherwise>
						</xsl:choose>
						<xsl:element name="amount">
							<xsl:value-of select="sfo:UnitPrice*sfo:Quantity" />
						</xsl:element>
						<xsl:element name="memo">
							<xsl:value-of select="sfo:PricebookEntry/sfo:Name" />
							<xsl:text> (Term: </xsl:text>
							<xsl:value-of select="sfo:Start_Date__c" />
							<xsl:text> - </xsl:text>
							<xsl:value-of select="sfo:End_Date__c" />
							<xsl:text>)</xsl:text>
						</xsl:element>
						<!-- Albin: Hardcoded it is always sales according to Lisa. -->
						<locationid>300</locationid>
						<!-- Albin: Hardcoded it is always sales according to Lisa. -->
						<department>40</department>
					</lineitem>
				</xsl:for-each>
			</invoiceitems>
		</create-invoice>
	</xsl:template>
</xsl:stylesheet>