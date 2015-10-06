<?php

namespace Agencia\MainBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class DefaultController extends Controller
{
    public function indexAction($name)
    {
        return $this->render('AgenciaMainBundle:Default:index.html.twig', array('name' => $name));
    }
}
