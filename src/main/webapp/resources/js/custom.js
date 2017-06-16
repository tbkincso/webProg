$(function () {
	//Better to construct options first and then pass it as a parameter
	$.fn.generateChart = function(dataPoints) {
        var options = {
            title: {
                text: "Spline Chart using jQuery Plugin"
            },
            animationEnabled: true,
            data: [
            {
                type: "spline", //change it to line, area, column, pie, etc
                dataPoints: dataPoints
            }
            ]
        };

        $("#chartContainer").CanvasJSChart(options);
	}

    $.fn.getSummaryData = function(id) {
        $.get( "/admin/event/summaryData/" + id, function( data ) {
            $.fn.generateChart(data.points);
            return;
        });
    }

});