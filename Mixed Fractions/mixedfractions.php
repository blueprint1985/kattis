<?php
	/**
	 * Ladder by Martin Björling, 
	 * martinbjorling@gmail.com, 0737565044
	 *
	 * @author   Martin Björling
	 * @version  1.0
	 * @since    2015-11-04
	 */

	$answers = [];

	while (true) {
		$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

		if ($inputString == "0 0") break;

		$inputArr = explode(" ", $inputString);

		$numerator = $inputArr[0];
		$denominator = $inputArr[1];

		$wholeNumber = floor($numerator / $denominator);
		$newNumerator = $numerator % $denominator;
		

        $answers[] = $wholeNumber." ".$newNumerator." / ".$denominator."\n";

        
	}

	foreach ($answers as $value) {
		fwrite(STDOUT, $value);
	}
	

?>