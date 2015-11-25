<?php
/**
 * Problem: Apaxiaaaaaaaaaaaans!
 * https://open.kattis.com/problems/apaxiaaans
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-25
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$prev = '0';

$answer = "";

for ($i=0; $i < strlen($inputString); $i++) { 
	$curr = $inputString[$i];

	if ($curr != $prev) {
		$answer .= $curr;
	}

	$prev = $curr;
}

fwrite(STDOUT, $answer);


?>