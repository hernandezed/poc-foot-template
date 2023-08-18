<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!-- Created with Inkscape (http://www.inkscape.org/) -->

<svg
        width="366"
        height="159"
        viewBox="0 0 96.837497 42.06875"
        version="1.1"
        id="svg139"
        inkscape:version="1.2.1 (9c6d41e, 2022-07-14)"
        sodipodi:docname="foot_template.svg"
        xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape"
        xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"
        xmlns:xlink="http://www.w3.org/1999/xlink"
        xmlns="http://www.w3.org/2000/svg"
        xmlns:svg="http://www.w3.org/2000/svg">
    <sodipodi:namedview
            id="namedview141"
            pagecolor="#505050"
            bordercolor="#ffffff"
            borderopacity="1"
            inkscape:showpageshadow="0"
            inkscape:pageopacity="0"
            inkscape:pagecheckerboard="1"
            inkscape:deskcolor="#505050"
            inkscape:document-units="mm"
            showgrid="false"
            inkscape:zoom="1.0253786"
            inkscape:cx="169.69342"
            inkscape:cy="195.53753"
            inkscape:window-width="1367"
            inkscape:window-height="771"
            inkscape:window-x="140"
            inkscape:window-y="463"
            inkscape:window-maximized="0"
            inkscape:current-layer="g735"/>
    <defs
            id="defs136"/>
    <g
            inkscape:label="Capa 1"
            inkscape:groupmode="layer"
            id="layer1">
        <g
                id="g735"
                transform="matrix(0.28222279,0,0,0.28222279,-1.6591031,-252.87344)">
            <rect
                    x="79.384003"
                    width="196.19"
                    y="913.65997"
                    id="rect4442-1"
                    height="13.361"
                    stroke-width="0.77375"/>
            <path
                    fill="none"
                    d="m 7.3939,896.91 h 342.44"
                    id="path3338"
                    stroke-dasharray="1.80709, 1.80709"
                    stroke-width="1.8071"
                    stroke="#000000"/>
            <text
                    word-spacing="0px"
                    id="STORE_NAME"
                    style="line-height:125%"
                    transform="scale(0.91897,1.0882)"
                    xml:space="preserve"
                    fill="#000000"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="88.825783"
                    y="865.15515"
                    font-size="14.272px"
                    line-height="125%"
                    dx="0 0 0 0 0 0 0 0 0 0 -2.3451009"><![CDATA[${storeId} ${storeName}]]></text>
            <text
                    word-spacing="0px"
                    id="COUNTRY_CODE"
                    style="line-height:125%"
                    transform="scale(0.79554,1.257)"
                    xml:space="preserve"
                    fill="#000000"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="8.7659531"
                    y="734.71582"
                    font-size="25.191px"
                    line-height="125%">${countryCode}</text>
            <text
                    word-spacing="0px"
                    id="DATE"
                    style="line-height:125%"
                    transform="scale(0.928,1.0776)"
                    xml:space="preserve"
                    fill="#000000"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="7.9760084"
                    y="870.72473"
                    font-size="10.393px"
                    line-height="125%">${maxExpeditionDate}</text>
            <text
                    word-spacing="0px"
                    id="DELIVERY_FL_NAME"
                    style="line-height:125%"
                    transform="scale(0.7611,1.3139)"
                    xml:space="preserve"
                    fill="#000000"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="121.43941"
                    y="735.18408"
                    font-size="18.64px"
                    line-height="125%">${shipmentFullName}</text>
            <rect
                    x="6.9370999"
                    width="38.164001"
                    y="946.04999"
                    id="rect4184"
                    height="22.653"/>
            <text
                    word-spacing="0px"
                    id="ITX_SERVICE"
                    style="line-height:125%"
                    transform="scale(0.75189,1.33)"
                    xml:space="preserve"
                    fill="#ffffff"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="13.643795"
                    y="725.72949"
                    font-size="17.671px"
                    line-height="125%">${transportServiceLevelCode}</text>
            <rect
                    x="90.654999"
                    <#if qrCode != "">
                        width="180.20999"
                    <#else >
                        width="257.20999"
                    </#if>
                    y="971.46997"
                    id="rect4190"
                    height="26.799"/>
            <#if qrCode == "">
                <text
                        word-spacing="0px"
                        id="text4194"
                        style="line-height:125%"
                        transform="scale(0.83753,1.194)"
                        xml:space="preserve"
                        fill="#ffffff"
                        font-weight="bold"
                        letter-spacing="0px"
                        font-family="Arial"
                        x="112.28055"
                        y="832.98779"
                        font-size="21.099px"
                        line-height="125%">Order num.</text>
            </#if>
            <rect
                    x="6.9370999"
                    width="80.166"
                    y="971.46997"
                    id="rect4190-4"
                    height="26.799"/>
            <text
                    word-spacing="0px"
                    id="CURRENT_BOX"
                    style="line-height:125%"
                    transform="scale(0.88135,1.1346)"
                    xml:space="preserve"
                    fill="#ffffff"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="11.286398"
                    y="875.151"
                    font-size="20.699px"
                    line-height="125%">${sequence}/${totalBoxes}</text>
            <text
                    word-spacing="0px"
                    id="NUM_ORDER"
                    style="line-height:125%"
                    transform="scale(0.8556,1.1688)"
                    xml:space="preserve"
                    fill="#ffffff"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    <#if qrCode != "">
                        x="112.28055"
                    <#else >
                        x="223.27037"
                    </#if>
                    y="851.6142"
                    font-size="21.555px"
                    line-height="125%">${customerOrderCode}</text>
            <g
                    fill="#000000"
                    id="CODE_ITX"
                    transform="matrix(6.8983349,0,0,5,60.377689,998.2631)"
                    stroke="none">
                <text
                        <#if qrCode=="">
                            x="17.325001"
                        <#else >
                            x="15.7"
                        </#if>
                        font-size="2.4691px"
                        y="9.1"
                        font-family="Arial"
                        text-anchor="middle"
                        id="text726">${barcode}</text>
            </g>
            <text
                    word-spacing="0px"
                    id="COURIER_INFO"
                    style="line-height:125%"
                    transform="scale(0.91897,1.0882)"
                    xml:space="preserve"
                    fill="#000000"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="88.825783"
                    y="837.43207"
                    font-size="14px"
                    line-height="125%">${shortCourierTag}</text>
            <text
                    word-spacing="0px"
                    id="ROUTE_INFO"
                    style="line-height:125%"
                    transform="scale(0.91897,1.0882)"
                    xml:space="preserve"
                    fill="#ffffff"
                    font-weight="bold"
                    letter-spacing="0px"
                    font-family="Arial"
                    x="90.866119"
                    y="850.43207"
                    font-size="12.5px"
                    line-height="125%">${transportRouteDescription}</text>
            <text
                    x="305.93042"
                    font-size="58.99px"
                    y="871.06012"
                    transform="scale(0.91036,1.0985)"
                    fill="#000000"
                    font-family="sans-serif"
                    style="line-height:125%"
                    id="text5736"
                    word-spacing="0px"
                    letter-spacing="0px"
                    xml:space="preserve"/>
            <!-- BEGIN_SECTION_STORE -->
            <path
                    fill="none"
                    d="m 5.8787,943.38 h 271.45"
                    stroke-width="0.78868"
                    id="path3338-3-9"
                    stroke="#000000"/>
            <rect
                    fill="#ffffff"
                    x="283.37"
                    width="63.847"
                    y="899.45001"
                    id="rect4442"
                    height="68.577003"/>
            <text
                    x="350.63275"
                    font-size="66.482px"
                    y="785.72101"
                    transform="scale(0.81612,1.2253)"
                    fill="#000000"
                    font-family="Arial"
                    style="line-height:125%"
                    id="NUM_ORDER_LAST_DIGITS"
                    stroke-width="1px"
                    word-spacing="0px"
                    letter-spacing="0px"
                    xml:space="preserve">${customerOrderCodeRight2}</text>
            <!-- END_SECTION_STORE -->
            <image
                    transform="matrix(-0.99999865,-0.00164601,5.6533207e-4,-0.99999984,0,0)"

                    y="-1032.719"
                    <#if qrCode == "">
                        x="-285.30588"
                        width="209.58662"
                    <#else >
                        x="-270"
                        width="200"
                    </#if>
                    height="30.78021"
                    preserveAspectRatio="none"
                    xlink:href="data:image/jpeg;base64,${barcodeImage} "
                    id="image171"/>
            <#if qrCode!="">
                <image
                        transform="matrix(-0.99999865,-0.00164601,5.6533207e-4,-0.99999984,0,0)"
                        x="-345.30588"
                        y="-1042.719"
                        width="71"
                        height="71"
                        preserveAspectRatio="none"
                        xlink:href="data:image/jpeg;base64,${qrCode} "
                        id="image171"/>
            </#if>
            <text
                    transform="scale(0.99353102,1.0065111)"
                    x="9.4703979"
                    y="1032.7491"
                    fill="#000000"
                    font-size="4.599px"
                    opacity="1"
                    stroke="#ffffff"
                    stroke-dasharray="0.0108638, 0.0217275"
                    stroke-width=".010864"
                    xml:space="preserve"
                    id="text121-5"
                    style="font-style:normal;font-variant:normal;font-weight:normal;font-stretch:normal;font-size:32.2329px;font-family:Arial;-inkscape-font-specification:'Arial, Normal';font-variant-ligatures:normal;font-variant-caps:normal;font-variant-numeric:normal;font-variant-east-asian:normal;display:inline;fill:#000000;stroke:#ffffff;stroke-width:0.0384941;stroke-dasharray:0.0384934, 0.0769863"><tspan
                        sodipodi:role="line"
                        id="tspan291-4"
                        x="9.4703979"
                        y="1032.7491"
                        style="stroke-width:0.0384941">${urgency}${maxExpeditionDay}</tspan></text>
        </g>
    </g>
</svg>