<?php

namespace Agencia\MainBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * Comision
 *
 * @ORM\Table()
 * @ORM\Entity
 */
class Comision
{
    /**
     * @var integer
     *
     * @ORM\Column(name="id", type="integer")
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     */
    private $id;

    /**
     * @var integer
     *
     * @ORM\Column(name="numero", type="integer")
     */
    private $numero;

    /**
     * @var string
     *
     * @ORM\Column(name="CiudadD", type="string", length=50)
     */
    private $ciudadD;

    /**
     * @var string
     *
     * @ORM\Column(name="FechaInicio", type="string", length=8)
     */
    private $fechaInicio;

    /**
     * @var string
     *
     * @ORM\Column(name="FechaFin", type="string", length=8)
     */
    private $fechaFin;

    /**
     * @var integer
     *
     * @ORM\Column(name="totalD", type="integer")
     */
    private $totalD;

    /**
     * @var integer
     *
     * @ORM\Column(name="ValorInscripcion", type="integer")
     */
    private $valorInscripcion;

    /**
     * @var integer
     *
     * @ORM\Column(name="ValorApoyoE", type="integer")
     */
    private $valorApoyoE;


    /**
     * Get id
     *
     * @return integer
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set numero
     *
     * @param integer $numero
     *
     * @return Comision
     */
    public function setNumero($numero)
    {
        $this->numero = $numero;

        return $this;
    }

    /**
     * Get numero
     *
     * @return integer
     */
    public function getNumero()
    {
        return $this->numero;
    }

    /**
     * Set ciudadD
     *
     * @param string $ciudadD
     *
     * @return Comision
     */
    public function setCiudadD($ciudadD)
    {
        $this->ciudadD = $ciudadD;

        return $this;
    }

    /**
     * Get ciudadD
     *
     * @return string
     */
    public function getCiudadD()
    {
        return $this->ciudadD;
    }

    /**
     * Set fechaInicio
     *
     * @param string $fechaInicio
     *
     * @return Comision
     */
    public function setFechaInicio($fechaInicio)
    {
        $this->fechaInicio = $fechaInicio;

        return $this;
    }

    /**
     * Get fechaInicio
     *
     * @return string
     */
    public function getFechaInicio()
    {
        return $this->fechaInicio;
    }

    /**
     * Set fechaFin
     *
     * @param string $fechaFin
     *
     * @return Comision
     */
    public function setFechaFin($fechaFin)
    {
        $this->fechaFin = $fechaFin;

        return $this;
    }

    /**
     * Get fechaFin
     *
     * @return string
     */
    public function getFechaFin()
    {
        return $this->fechaFin;
    }

    /**
     * Set totalD
     *
     * @param integer $totalD
     *
     * @return Comision
     */
    public function setTotalD($totalD)
    {
        $this->totalD = $totalD;

        return $this;
    }

    /**
     * Get totalD
     *
     * @return integer
     */
    public function getTotalD()
    {
        return $this->totalD;
    }

    /**
     * Set valorInscripcion
     *
     * @param integer $valorInscripcion
     *
     * @return Comision
     */
    public function setValorInscripcion($valorInscripcion)
    {
        $this->valorInscripcion = $valorInscripcion;

        return $this;
    }

    /**
     * Get valorInscripcion
     *
     * @return integer
     */
    public function getValorInscripcion()
    {
        return $this->valorInscripcion;
    }

    /**
     * Set valorApoyoE
     *
     * @param integer $valorApoyoE
     *
     * @return Comision
     */
    public function setValorApoyoE($valorApoyoE)
    {
        $this->valorApoyoE = $valorApoyoE;

        return $this;
    }

    /**
     * Get valorApoyoE
     *
     * @return integer
     */
    public function getValorApoyoE()
    {
        return $this->valorApoyoE;
    }
}

