<?php
/**
 * Problem: Ladder
 * https://open.kattis.com/problems/ladder
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$inputArr = explode(" ", $inputString);

$wallHeight = $inputArr[0];
$laddAngle = deg2rad($inputArr[1]);

$laddLength = $wallHeight / sin($laddAngle);

$answer = ceil($laddLength );

fwrite(STDOUT, $answer);

?>