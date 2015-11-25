<?php
	/**
	 * Ladder by Martin Björling, 
	 * martinbjorling@gmail.com, 0737565044
	 *
	 * @author   Martin Björling
	 * @version  1.0
	 * @since    2015-11-04
	 */

	$lineLengths = [];

	while ($inputString = stream_get_line(STDIN, 1024, PHP_EOL)) {
		$lineLengths[] = strlen($inputString);
	}

	$last = array_pop($lineLengths);

	if (count($lineLengths) > 0) {
		sort($lineLengths, SORT_NUMERIC);

		$longest = $lineLengths[count($lineLengths)-1];
	} else {
		$longest = $last;
	}

	if ($last > $longest) {
		$longest = $last;
		$i = count($lineLengths)-1;
	} else {
		$i = count($lineLengths)-2;
	}

	$score = 0;

	while ($i >= 0) {
		$current = $lineLengths[$i];
		$score += pow(($longest-$current), 2);
		$i--;
	}

	fwrite(STDOUT, $score);


?>